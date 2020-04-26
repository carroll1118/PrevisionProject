
class demo3{
    public static void main(String[] args){
        JdbcDemo jdbcDemo = JdbcDemo.getJdbcDemo();
        System.out.println(jdbcDemo.getConnection());
    }
}