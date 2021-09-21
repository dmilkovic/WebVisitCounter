public abstract interface WebPageInterface {
    public void addVisitor(String address);
    public int getUniqueCount();
    public int getTotalCount();
    public String getWebPageName();
    public void printOutUsers();
}
