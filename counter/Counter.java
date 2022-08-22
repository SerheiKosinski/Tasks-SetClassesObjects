package counter;

public class Counter {
   private int count;
   private int min;
   private int max;

    public Counter() {
    	count = 0;
    	min = 0;
    	max = 100;
    }

    public Counter(int min, int max) {
    	
       
	   this.min = min;
	   this.max = max;
	   if (min>max) {
		   int x = 0;
		   x = min;
		   min = max;
		   max = x;
		   
	   }
  
    }

   public Counter(int count, int min, int max) {
	   this.count = count;
	   this.min = min;
	   this.max = max;
	   
	   if (min>max) {
		   int x = 0;
		   x = min;
		   min = max;
		   max = x;}
		   
      if (count > max) {
		  count = min;
      }
      if (count < min) {
		  count = max;
	
	}
   
      }

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

public int getMin() {
	return min;
}

public void setMin(int min) {
	this.min = min;
}

public int getMax() {
	return max;
}

public void setMax(int max) {
	this.max = max;
	
}
public void counterIncr() {
	count++;
	
	// если текущее значение счктчика становится больше максимального, то счетчик сбрасывается до минимального
	if (count > max) {
		count = min;
	}
}

public void counterDecr() {
	count--;
	
	// если текущее значение счктчика становится меньше минимального, то счетчик сбрасывается до максимального
	if (count < min) {
		count = max;
	}
}

public int returnCurrent() {
	return count;
}
@Override
public String toString() {
	return "Counter [count=" + count + ", min=" + min + ", max=" + max + ", getCount()=" + getCount() + ", getMin()="
			+ getMin() + ", getMax()=" + getMax() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}



}
