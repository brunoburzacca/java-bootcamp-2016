package topic5;

import java.awt.List;
import java.net.UnknownHostException;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

/**
 * A MongoDB and Morphia Example
 *
 */
public class Demo {

	public static void main(String[] args) throws UnknownHostException, MongoException {
	
		String dbName = new String("highschool");
		System.out.println("Prueba conexión MongoDB");
		MongoClient mongo = crearConexion();

		if (mongo != null) {
			System.out.println("Lista de bases de datos: ");
			printDatabases(mongo);

		} else {
			System.out.println("Error: Conexión no establecida");
		}

		Morphia morphia = new Morphia();
		Datastore datastore = morphia.createDatastore(mongo, dbName);
		morphia.mapPackage("topic5");
		if (mongo == null) {
			
		Student student = new Student();
		student.setBirth("01/10/2000");
		student.setCourse("Math");
		student.setName("student1");
		student.setLastName("Perez");
		student.setFirst(1);
		student.setSecond(1);
		student.setThird(1);
		student.setTotal(1);
		datastore.save(student);
		
		
		Student student2 = new Student();
		student2.setBirth("01/10/2000");
		student2.setCourse("english");
		student2.setName("student1");
		student2.setLastName("Perez");
		student2.setFirst(8);
		student2.setSecond(8);
		student2.setThird(8);
		student2.setTotal(8);	
		datastore.save(student2);
				
		Student student4 = new Student();
		student4.setBirth("01/10/2000");
		student4.setCourse("math");
		student4.setName("student3");
		student4.setLastName("gomez");
		student4.setFirst(8);
		student4.setSecond(8);
		student4.setThird(8);
		student4.setTotal(8);
		datastore.save(student4);
		
		Student student3 = new Student();
		student3.setBirth("01/10/2000");
		student3.setCourse("math");
		student3.setName("student2");
		student3.setLastName("gonzales");
		student3.setFirst(8);
		student3.setSecond(8);
		student3.setThird(8);
		student3.setTotal(8);
		datastore.save(student3);
		}
										
		StudentDAO studentDAO = new StudentDAO(mongo, morphia, dbName);
		
		
		
		Query<Student> query = datastore.createQuery(Student.class);
		query.and(
				
				query.criteria("total").greaterThan(4),
				query.criteria("course").equal("math")

		);

		QueryResults<Student> retrievedStudents = studentDAO.find(query);

		 
		for (Student retrievedStudent : retrievedStudents) {
			System.out.println("name: " + retrievedStudent.getName()+
								" lastName : "+ retrievedStudent.getLastName()
								+" course : " + retrievedStudent.getCourse()
								+" birth: " + retrievedStudent.getBirth()
								+" final note :" + retrievedStudent.getTotal());

		}

	}

	
	private static MongoClient crearConexion() {
		MongoClient mongo = null;
		mongo = new MongoClient("localhost", 27017);

		return mongo;
	}

	
	private static void printDatabases(MongoClient mongo) {
		java.util.List<String> dbs = mongo.getDatabaseNames();
		for (String db : dbs) {
			System.out.println(" - " + db);
		}
	}

}