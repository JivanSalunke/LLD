public class Aclass {
    public static void main(String[] args) {

        for(int h=0;h<5;h++){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    for(int k=0;k<5;k++){
                        if(i%2==0) {
                            if((h+j)%2==0){
                                if(k%2==0){
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                            }else{
                                if(i!=2){
                                    System.out.print("*");
                                }
                                else if(i==2 &&(k==0 || k==4)) {
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                            }
                        }
                        else{
                            if((h+j)%2==0){
                                if((i+k)%2==0){
                                    System.out.print("*");
                                }else {
                                    System.out.print(" ");
                                }
                            }else{
                                if(k==0 || k==4){
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                            }
                        }
                    }
                    System.out.print(" ");
                    System.out.print(" ");
                }
                System.out.println();
//                if(i==4)System.out.println();
            }
        }
    }
}
//line number 43 and 47 is added for extra spacing to see the clear output;
