class OrderedStream {
    int pointer;
    String [] result;

    public OrderedStream(int n) {
        pointer =0;
        result = new String[n];
        
        
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> answer = new ArrayList<>();
        result[idKey-1]=value;
        while(pointer<result.length && result[pointer]!=null){
            
            answer.add(result[pointer]);
            pointer++;
        }
        return answer;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */