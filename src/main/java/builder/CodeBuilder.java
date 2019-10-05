package builder;

import java.util.HashMap;
import java.util.Map;

public class CodeBuilder {

    String className;
    Map<String,String> instamceVeriables = new HashMap<>();
    public CodeBuilder(String className) {
        this.className = className;
    }

    public CodeBuilder addField(String name, String value){
        this.instamceVeriables.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder cb = new StringBuilder();
        cb.append("public class "+this.className+"\n{\n");
        this.instamceVeriables.keySet().forEach( key -> cb.append("  public "+instamceVeriables.get(key)+" "+key+";\n"));
        cb.append("}");
        return cb.toString();
    }

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person").addField("name","String").addField("age","int");
        System.out.println(cb);
    }
}
