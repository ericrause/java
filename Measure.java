//need imports
class Shape {
    double width;
    double height;
    double thirdVal;
    string type;
    
    Shape(double w, double h) {                 //rectangle
        width = w;
        height = h;
    }
    
    Shape(double side){                         //square
        width = height = side;
    }
    
    Shape(double r, string str){                //circle
        width = r;
        type = str;     
    }
    
    Shape(double s1, double s2, double s3){    //triangle
        width = s1;
        height = s2;
        thirdVal = s3;
    }
    
    @Override
    double countSpace(){
        if (type = "" and thirdVal = "") {      //case square or rectangle
            return width * height;
        }
        else {
            if (type = "circle"){               //case circle
                return Math.pi*r*r;
            }
            else {                              //case triangle
                double p = (s1 + s2 + s3)/2
                return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
            }
        }
    }
    @Override
    double countPerimeter(){
        if (type = "" and thirdVal = "") {      //case square or rectangle
            return (width*2) + (height*2);
        }
        else {
            if (type = "circle"){               //case circle
                return Math.pi*2*r;
            }
            else {                              //case triangle
                return s1 + s2 + s3;
            }
        }
    }
}
class Measure implements CountMe {
    public static void main(String args[]){
        getParameters();
        Shape box = new Shape(paramsDouble[0]);
        Shape reck = new Shape(paramsDouble[0], paramsDouble[1]);
        
        double space;
        double perimeter;
        
        space = box.countSpace();
        perimeter = box.countPerimeter();
        System.out.println("box space is " +space);
        System.out.println("box perimeter is " +perimeter);
    }
    
    @Override
    public string[] getParameters(){
        System.out.println("Please input parameters (for circle write: circle <radius>):");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String params = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        string spaces = "[ ]+";
        string[] params = params.split(spaces);
        
        double paramsDouble[];
        paramsDouble[0] = Double.parseDouble(params[0]);
        paramsDouble[1] = Double.parseDouble(params[1]);
        paramsDouble[2] = Double.parseDouble(params[2]);
        return paramsDouble[];
        
    }
    
}
    