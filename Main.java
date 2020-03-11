public class Main{
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.setName("安眠書店");
        book1.setAuthor("Caroline Kepnes");
        book1.setlanguage("英文");
        book1.setGenre("驚悚");
        book1.setPublished("2014年9月30日");

        book2.setName("分歧者");
        book2.setAuthor("Veronica Roth");
        book2.setlanguage("英文");
        book2.setGenre("科幻.反烏托邦");
        book2.setPublished("2011年4月25日");

        book3.setName("飢餓遊戲");
        book3.setAuthor("Suzanne Collins");
        book3.setlanguage("英文");
        book3.setGenre("科幻.反烏托邦");
        book3.setPublished("2008年–2010年");

        System.out.println("書名:"+book1.getName());
        System.out.println("作者:"+book1.getAuthor());
        System.out.println("語言:"+book1.getlanguage());
        System.out.println("類型:"+book1.getGenre());
        System.out.println("發行日:"+book1.getPublished());
        System.out.print("\n");

        System.out.println("書名:"+book2.getName());
        System.out.println("作者:"+book2.getAuthor());
        System.out.println("語言:"+book2.getlanguage());
        System.out.println("類型:"+book2.getGenre());
        System.out.println("發行日:"+book2.getPublished());
        System.out.print("\n");

        System.out.println("書名:"+book3.getName());
        System.out.println("作者:"+book3.getAuthor());
        System.out.println("語言:"+book3.getlanguage());
        System.out.println("類型:"+book3.getGenre());
        System.out.println("發行日:"+book3.getPublished());

    }
}