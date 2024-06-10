package org.example.listsupermarket;

public class SupermaketArray implements Supermarket{

    private final String [] items;
    private int lastIndex = -1;

    public SupermaketArray(final int size){
        this.items = new String[size];
    }
    @Override
    public void add(final String item) {
        if (this.lastIndex == this.items.length -1){
            System.err.println("Lista do supermercado cheia");
        }else{
            ++ this.lastIndex;
            this.items[this.lastIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("################################################");
        if (this.lastIndex <0){
            System.out.println("Lista de supermercado vazia .");
        }

        for(int i=0;i<=this.lastIndex;i++){
            System.out.println(i+ " - " +this.items[i]);
        }

        System.out.println("################################################");
    }

    @Override
    public void delete(final int index) {
        if (index >= 0 && index <= this.lastIndex ){
            shift(index);
            lastIndex--;
        }else {
            System.out.println("Indice Invalido." + index);
        }

    }

    private void shift(int index) {
        for (int i = index ;i <lastIndex; i++){
            this.items[i] = this.items[i+1];
        }
    }

    public String[] getItems() {
        return items;
    }
}
