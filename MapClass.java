package hadoop;

import java.io.IOException;

import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class MapClass extends MapReduceBase implements Mapper<K1, V1, K2, V2> {

  @Override
	public void map(K1 key, V1 value, OutputCollector<K2, V2> output, Reporter report) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
