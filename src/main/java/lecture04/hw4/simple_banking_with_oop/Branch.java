package lecture04.hw4.simple_banking_with_oop;

class Branch {
    private String code;
    private String city;
    private int rank;

    public Branch(String code, String city, int rank) {
        this.code = code;
        this.city = city;
        this.rank = rank;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Branch code: " + this.code + ", city: " + this.city + ", rank: " + this.rank;
    }
}