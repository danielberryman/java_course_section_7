public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if(tonerLevel < 0){
            this.tonerLevel = 0;
        } else if(tonerLevel > 100){
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int toner){
        if(toner < 0){
            System.out.println("Input must be a positive %.");
        } else {
            if(tonerLevel + toner > 100){
                tonerLevel = 100;
            } else {
                tonerLevel += toner;
            }
        }
    }

    public void printPage(int pagesToPrint){
        pagesPrinted += pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        if(tonerLevel < 0){
            this.tonerLevel = 0;
        } else if(tonerLevel > 100){
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }
}
