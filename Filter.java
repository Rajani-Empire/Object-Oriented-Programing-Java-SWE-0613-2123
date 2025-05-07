class Products{
    public void filterProducts(String catagory){
      System.out.println("product Catagory :"+catagory);
    }

    public void filterProducts(int max,int min){
        System.out.println("product Catagory :"+max+" "+min);
      }

      public void filterBrand(String brand){
        System.out.println("product Brand :"+brand);
      }

      public void filterProducts(String catagory,int min,int max){
        System.out.println("product  :"+catagory+" "+max+" "+min);
      }


}




public class Filter {
    public static void main(String[] args) {

        Products p = new Products();


        p.filterProducts("HRTK5K");
        p.filterProducts(100,50);
        p.filterProducts("HRTK5K",100,50);
        p.filterBrand("HEJTHU5");

        
    }
    
}
