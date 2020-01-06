package repl;

public class Repl_187_MethodsWithString10_Lamedb {
    public static void main(String[] args) {


//
//        A database (DB), in the most general sense, is an organized collection of data. ...
//        In other words, a database is used by an organization as a method of storing, managing and retrieving information.
//                When you work data in databases, you can read, add, edit, delete data.
//
//                Lame database.
//
//                This method gets 4 strings and returns a string.
//                This method creates a very basic database interaction.
//                you can add, edit and remove data from the database.
//        all this using only String and string methods.
//        an example database may look like this:
//        1data#2moredata#3yet more data
//
//        if we use split("#") it will turn into an array.
//
//        as a database table it will look like this:
//        1data
//        2moredata
//        3yet more data
//
//        each row has a number id (1, 2 ,3) in above example.
//                each row of data is separated by #
//        data in each row is right after id
//
//        parameters:
//
//        String db : holds the whole lame database as a string. You will modify this parameter value depending on operation requested
//
//        String op : op is short for operation, the operation the method will do on the database,
//                there are 3 : add, edit and delete. For any other operation, return the database as is.
//
//                String id : holds the id of the database row we want to manipulate, we use the id to find the
//        database row we want to manipulate
//
//        String data : holds a string of data we will use for the add or edit operations
//
//        example use of the method:
//
//        m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
//        returns:  1etsy#2wooden#3spoon#4aaa
//                (since operation is 'add', we added '#4aaa' to the end and return)
//
//        m.lameDb("1test#2bla#3foo","edit","2","bbb")
//        returns:  1test#2bbb#3foo
//                (since operation is 'edit', we edited id 2 to '#2bbb' to the end and return)
//
//
//        m.lameDb("1tst#2bla#3foo","delete","1","")
//        returns:  #2bla#3foo
//
//        m.lameDb("1tst#2bla#3foo","none","1","")
//        returns:  1tst#2bla#3foo

//        System.out.print(
//                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
//        );
//
//        System.out.print(
//                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
//        );
//
//        System.out.print(
//                lameDb("1tst#2bla#3foo","delete","1","")+"\n"
//        );
//
//        System.out.print(
//                lameDb("1tst#2bla#3foo","none","1","")+"\n"
//        );

//    }
//
//    public static String lameDb(String db, String op,String id,String data)
//    {
        String db="1data#2moredata#3yet";
        String op="delete";
        String id="2";
        String data="";

        String db1=db.substring(0,db.indexOf("#"));
        System.out.println("db1 = " + db1);
        String db2=db.substring(db.indexOf("#")+1,db.lastIndexOf("#"));
        System.out.println("db2 = " + db2);
        String db3=db.substring(db.lastIndexOf("#")+1);
        System.out.println("db3 = " + db3);

        if(op.equals("add")) {
            if (id.equals("4")) {
                System.out.println(db + "#4" + data);
            }
        }
        if(op.equals("edit")){
            if(id.equals("1")){
                System.out.println(db.replace(db1,"1"+data));
            }
            if(id.equals("2")){
                System.out.println(db.replace(db2,"2"+data));
            }
            if(id.equals("3")){
                System.out.println(db.replace(db3,"3"+data));
            }
        }
        else if(op.equals("delete")){
            if(id.equals("1")){
                System.out.println(db.replace(db1,""));
            }
            if(id.equals("2")){
                System.out.println(db.replace(db2+"#",""));
            }
            if(id.equals("3")){
                System.out.println(db.replace(db3,""));
            }
        }
return;

    }



    }//end lameDb



