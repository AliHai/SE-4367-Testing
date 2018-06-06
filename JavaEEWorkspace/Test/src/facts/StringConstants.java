package facts;

// this design pattern allows all necessary classes to implement the string constant interfaces
// any class that implements StringConstants has access to the constant strings
// this ensures modularity

// Edit this file to allow project to build correctly with your workspace path

public interface StringConstants {
	public static final String jsFile = "C:/Users/Alex/Desktop/SE-4367-Testing/JavaEEWorkspace/Test/src/facts/facts.js";
	public static final String xmlFile = "C:/Users/Alex/Desktop/SE-4367-Testing/JavaEEWorkspace/Test/WebContent/WEB-INF/data/facts.xml";
	public static final String thisServlet = "http://localhost:8080/Test/";
}
