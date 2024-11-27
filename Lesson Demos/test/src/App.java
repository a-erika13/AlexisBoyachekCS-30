public class App {
    public static void main(String[] args) throws Exception {
    
        int c = 5, d = 10;
if(d>c){
   if(c > 50)
      c /= 2;
   else
      c = d-c;
   d = d/5;
}
else{
   c = c/2;
   d = d/2+3;
}
System.out.println(c);
System.out.println(d);
}
}

