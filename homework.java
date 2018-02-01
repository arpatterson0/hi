public class Book {
    private double retailPrice;
    private int pages;
    
    public boolean setData(double retailPrice,int pages){
        if (retailPrice < 3.95 || retailPrice > 120.00 || pages < 32 || pages > 1200){
        return false;
        }
        else {
            this.retailPrice = retailPrice;
        this.pages = pages;
        return true;
        }
    }
        public double getPrice(){
            double Price = retailPrice ;
            return retailPrice;
        }
            public double getPricePerPage(){
        double priceperpage = retailPrice / pages;
return priceperpage;        
        
        }
            public boolean changePrice(double retailPrice){
                if (retailPrice < 3.95 || retailPrice > 120.00){
                    return false;                }
                else {
                    
                    
                this.retailPrice = retailPrice;
                return true;
                  }
                
              }
    
}