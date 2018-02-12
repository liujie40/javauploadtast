package 문제풀이3.복습;

public class CompactDisc extends Product {
    private String 앨범제목   = "";
    private String 가수이름정보 = "";
    
    public CompactDisc() {
        super();
    }
    
    public CompactDisc(String 상품고유식별자, String 상품설명, String 생산자, String 가격정보,
            String 앨범제목, String 가수이름정보) {
        super(상품고유식별자, 상품설명, 생산자, 가격정보);
        this.앨범제목 = 앨범제목;
        this.가수이름정보 = 가수이름정보;
    }
    
    public String get앨범제목() {
        return 앨범제목;
    }
    
    public void set앨범제목(String 앨범제목) {
        this.앨범제목 = 앨범제목;
    }
    
    public String get가수이름정보() {
        return 가수이름정보;
    }
    
    public void set가수이름정보(String 가수이름정보) {
        this.가수이름정보 = 가수이름정보;
    }
    
    @Override
    public String toString() {
        return "앨범제목: " + 앨범제목 + "\n가수이름정보: " + 가수이름정보
                 + super.toString() ;
    }
    
}
