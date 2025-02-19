package mybatis_generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class TestGenerator {

	 public static void generator() throws Exception{
	        List<String> warnings = new ArrayList<String>();
	        boolean overwrite = true;
	        //指定 逆向工程配置文件
	        File configFile = new File("xml/config4.xml"); 
	        ConfigurationParser cp = new ConfigurationParser(warnings);
	        Configuration config = cp.parseConfiguration(configFile);
	        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
	                callback, warnings);
	        myBatisGenerator.generate(null);
	    } 
	
	public static void main(String[] args) throws Exception {
		generator();
		System.out.println("生成完成，请刷新项目");
	}

}
