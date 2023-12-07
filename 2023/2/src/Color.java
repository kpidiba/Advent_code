public enum Color {
    RED(12,"ROUGE"),
    BLUE(14,"BLEU"),
    GREEN(13,"VERT");
    private String name;
    private int limit;
    Color(int limit,String name){
        this.name = name;
        this.limit = limit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    

    
}
