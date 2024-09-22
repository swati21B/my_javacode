package Collection;

import java.util.Vector;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class VectorProgram {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(25);
		v1.add(55);
		v1.add(80);
		System.out.println(v1);
		Vector v2 = new Vector();
		v2.addAll(v1);
		v2.add(90);
		System.out.println(v2);
		System.out.println(v2.contains(55));
		//v2.get(25);
		v2.capacity();
		System.out.println(v2);
		v2.clear();
		
		
		
		

	}

}
