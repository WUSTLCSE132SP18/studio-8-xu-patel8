package studio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.

public class CountSteps {

	public static void main(String[] args) {

		String line = "";
		String csvSplitBy = ",";
		double zReadings[] = new double [540];

		File readings = new File("C:\\Users\\ppate\\git\\studio-8-xu-patel8\\data\\readings2.csv");
		try {
			Scanner sc = new Scanner(readings).useDelimiter(csvSplitBy);
			while ((sc.hasNextLine()) == true) {
				String csvReadings = sc.nextLine();
				csvReadings.split(csvSplitBy);
				
				//iterate through the string by 3 to get the Z values
				
				for (int i = 0; i < zReadings.length; i = i + 3) {
					double x = sc.nextDouble();
					double y = sc.nextDouble();
					double z = sc.nextDouble();
					zReadings[i] = z; 
					System.out.println(z);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



	}


}
