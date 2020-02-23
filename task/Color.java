package task;

import java.util.Arrays;

public class Color {
        private int[] rgb = new int[3];
    String str;
        public final static int[] WHITE     = new int[]{255, 255, 255};
        public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
        public final static int[] GRAY      = new int[]{128, 128, 128};
        public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
        public final static int[] BLACK     = new int[]{0, 0, 0};
        public final static int[] RED       = new int[]{255, 0, 0};
        public final static int[] PINK      = new int[]{255, 175, 175};
        public final static int[] ORANGE    = new int[]{255, 200, 0};
        public final static int[] YELLOW    = new int[]{255, 255, 0};
        public final static int[] GREEN     = new int[]{0, 255, 0};
        public final static int[] MAGENTA   = new int[]{255, 0, 255};
        public final static int[] CYAN      = new int[]{0, 255, 255};
        public final static int[] BLUE      = new int[]{0, 0, 255};

        public Color(int r, int g, int b){
            //TODO
           this.rgb[0] =r;
            this.rgb[1]=g;
            this.rgb[2]=b;
            }

        public Color() {
            //TODO
            System.out.println("white");

        }

        public void color1(int r, int g, int b){
            if (Arrays.equals(rgb,LIGHT_GRAY)) {
                str= "light gray";
            }else if (Arrays.equals(rgb,GRAY)) {
                str = "gray";
            }   else if (Arrays.equals(rgb,WHITE)){
                str="white";

            }else if (Arrays.equals(rgb,DARK_GRAY)){
                str="dark gray";

            }else if ( Arrays.equals(rgb,BLACK)){
                str="black";

            }else if ( Arrays.equals(rgb,RED)){
                str="red";

            }else if (Arrays.equals(rgb,PINK)){
                str="pink";

            }else if ( Arrays.equals(rgb,ORANGE)){
                str="orange";

            }else if ( Arrays.equals(rgb,YELLOW)){
                str="yellow";

            }else if ( Arrays.equals(rgb,GREEN)){
                str="green";

            }else if ( Arrays.equals(rgb,MAGENTA)){
                str="magenta";

            }else if ( Arrays.equals(rgb,CYAN)){
                str="cyan";

            }else if ( Arrays.equals(rgb,BLUE)){
                str="blue";

            }else  {
                str= "n/a";}

        }

       public String toString() {

        return str;
    }



    public static void main(String[] args) {
        Color c1= new Color(0,0,255);
        System.out.println(c1.toString() ) ;
    }
    }





