public abstract interface SortableWebPage {
    public void addVisitor(String address);
    public void printOutUsers();
    public int getUniqueCount();
    public int getTotalCount();
    public String getWebPageName();
}
