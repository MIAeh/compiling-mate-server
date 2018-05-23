package ecnu.compiling.compilingmate.entity;

import java.util.Arrays;
import java.util.Objects;

public class Production {
    public String left;
    public String[] right;

    public Production(String left, String[] right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Production other=(Production)obj;
        if(!other.left.equals(left))
            return false;
        else if(!Arrays.equals(other.right,right)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(left,right);
    }




}
