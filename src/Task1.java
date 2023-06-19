public class Task1 {
  public static String exec(String[] data){
    StringBuilder result = new StringBuilder();
    String c = "select * from student where ";
    result.append(c);
    result.append(data[0]);
    result.append("=");
    result.append("'");
    result.append(data[1]);
    result.append("'");
    result.append(" AND ");
    result.append(data[2]);
    result.append("=");
    result.append("'");
    result.append(data[3]);
    result.append("'");
    result.append(" AND ");
    result.append(data[4]);
    result.append("=");
    result.append("'");
    result.append(data[5]);
    result.append("'");
    

    return result.toString();
  }
}