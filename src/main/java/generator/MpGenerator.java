package generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 代码生成�?
 * */
public class MpGenerator {

    //生成路径
    final static String  dirPath = "D:\\MpGenerator";

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默�? Veloctiy
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        // set freemarker engine
//        generator.setTemplateEngine(new FreemarkerTemplateEngine());
//
//        // set beetl engine
//        generator.setTemplateEngine(new BeetlTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        final String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("YU.J");
        gc.setOpen(false);
        mpg.setGlobalConfig(gc);

        // 数据源配�?
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.SQL_SERVER);
        dsc.setUrl("jdbc:sqlserver://192.168.13.129:1433;DatabaseName=testDB");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dsc.setUsername("sa");
        dsc.setPassword("huihe123");
        mpg.setDataSource(dsc);


         //自定义文件命名，注意 %s 会自动填充表实体属�?�！
         gc.setMapperName("%sMapper");
         gc.setXmlName("%sMapper");
         gc.setServiceName("%sService");
         gc.setServiceImplName("%sServiceImpl");
         gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        //strategy.setTablePrefix(new String[] { "tb_", "tsys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude("t_cook_type"); // �?要生成的�?
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父�?
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定�? mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定�? service 父类
        strategy.setSuperServiceClass("com.baomidou.mybatisplus.extension.service.IService");
        // 自定�? service 实现类父�?
        strategy.setSuperServiceImplClass("com.baomidou.mybatisplus.extension.service.impl.ServiceImpl");
        // 自定�? controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体�?�是否生成字段常量（默认 false�?
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体�?�是否为构建者模型（默认 false�?
        // public User setName(String name) {this.name = name; return this;}
        strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);

       /* // 包配�?
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.cyj");
        pc.setModuleName("login");
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setXml("mapper");

        mpg.setPackageInfo(pc);*/

        // 注入自定义配置，可以�? VM 中使�? cfg.abc 【可无�??
        /*InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };*/

        // 自定�? xxList.jsp 生成
        //List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
/*        focList.add(new FileOutConfig("/template/list.jsp.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名�?
                return "D://my_" + tableInfo.getEntityName() + ".jsp";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);*/

        // 调整 xml 生成目录演示
/*        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return dirPath + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        */
        //mpg.setCfg(cfg);

        // 关闭默认 xml 生成，调整生�? �? 根目�?
/*        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        mpg.setTemplate(tc);*/

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改�?
        // 放置自己项目�? src/main/resources/templates 目录�?, 默认名称�?下可以不配置，也可以自定义模板名�?
        // TemplateConfig tc = new TemplateConfig();
        // tc.setController("...");
        // tc.setEntity("...");
        // tc.setMapper("...");
        // tc.setXml("...");
        // tc.setService("...");
        // tc.setServiceImpl("...");
        // 如上任何�?个模块如果设�? �? OR Null 将不生成该模块�??
        // mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();

        // 打印注入设置【可无�??
       // System.err.println(mpg.getCfg().getMap().get("abc"));
    }
}
