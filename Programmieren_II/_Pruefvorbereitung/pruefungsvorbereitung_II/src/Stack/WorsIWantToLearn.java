package Stack;

public class WorsIWantToLearn {
    Element peekElement = null;
    public void push(String data){
        peekElement = new Element(data, peekElement);

    }
    public String pop(){
        if(peekElement != null){
            String data = peekElement.getData();
            peekElement = peekElement.getPrevElement();
            return data;
        }
        return null;
    }
    public String peek(){
        if(peekElement != null){
            return peekElement.getData();
        }
        return null;
    }
    private class Element{
        private String data;
        private Element prevElement;

        public Element(String data, Element prevElement){
            this.data = data;
            this.prevElement = prevElement;
        }
        public String getData(){
            return data;
        }
        public Element getPrevElement(){
            return prevElement;
        }
    }
}
