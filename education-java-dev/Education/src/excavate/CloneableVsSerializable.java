 package excavate;

import java.io.Serializable;

//first level of classes
public class CloneableVsSerializable {

    //second level; can be cloned
    public static class Clone implements Cloneable{

        private String title;
        private int pages;

        public Clone(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }

        //getter-setter
        public String getTitle() {return title;}
        public void setTitle(String title) {this.title = title;}

        public int getPages() {return pages;}
        public void setPages(int pages) {this.pages = pages;}

        //method for cloning
        public Clone clone() throws CloneNotSupportedException{
            return (Clone) super.clone();
        }

        @Override
        public String toString() {
            return "Clone{" +
                    "title='" + title + '\'' +
                    ", pages=" + pages +
                    '}';
        }
    }


    public class SerializeAble implements Serializable{

    }



    public static void main(String[] args) throws CloneNotSupportedException {
        Clone clone = new Clone("Art Of War", 300);
        Clone clone1 = clone.clone();

        System.out.println(clone.hashCode() + clone.toString());
        System.out.println(clone.hashCode());

        System.out.println(clone1.hashCode() + clone1.toString());
        System.out.println(clone1.hashCode());

    }

}
