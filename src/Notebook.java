import java.util.Objects;

public class Notebook {
    private String name;
    private String model;
    private String oS;
    private String color;
    private Float screenDiagonal;
    private String processor;
    private Integer RAM;
    private Integer capacityHD;

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setoS(String oS) {
        this.oS = oS;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setScreenDiagonal(Float screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRAM(Integer RAM) {
        if (RAM > 0) {
            this.RAM = RAM;
        } else {
            System.out.println("Ошибка!\nОбъём оперативной памяти не может быть ниже 1");
        }
    }

    public void setCapacityHD() {
        if (capacityHD > 0) {
            this.capacityHD = capacityHD;
        } else {
            System.out.println("Ошибка!\nОбъём жесткого диска не может быть ниже 1");
        };
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getoS() {
        return oS;
    }

    public String getColor() {
        return color;
    }

    public Float getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getProcessor() {
        return processor;
    }

    public Integer getRAM() {
        return RAM;
    }

    public Integer getCapacityHD() {
        return capacityHD;
    }

    @Override
    public String toString() {
        return name + '\'' +
                " " + model + '\'' +
                ", Операционная система: " + oS + '\'' +
                ", цвет: " + color + '\'' +
                ", Диагональ экрана: " + screenDiagonal +
                ", процессор: " + processor + '\'' +
                ", ОЗУ: " + RAM +
                ", Объём ЖД " + capacityHD +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return name.equals(notebook.name) && Objects.equals(model, notebook.model) && Objects.equals(oS, notebook.oS) && Objects.equals(color, notebook.color) && Objects.equals(screenDiagonal, notebook.screenDiagonal) && Objects.equals(processor, notebook.processor) && RAM.equals(notebook.RAM) && Objects.equals(capacityHD, notebook.capacityHD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, oS, color, screenDiagonal, processor, RAM, capacityHD);
    }

    public Notebook(String name, String model, String oS, String color, Float screenDiagonal, String processor, Integer RAM, Integer capacityHD) {
        this.name = name;
        this.model = model;
        this.oS = oS;
        this.color = color;
        this.screenDiagonal = screenDiagonal;
        this.processor = processor;
        this.RAM = RAM;
        this.capacityHD = capacityHD;
    }
}
