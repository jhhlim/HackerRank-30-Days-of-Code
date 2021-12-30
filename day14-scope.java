
    public Difference(int []elements)
        {
            this.elements = elements;
        }
        void computeDifference(){
            Arrays.sort(elements);
            int n = elements.length;
            maximumDifference = Math.abs(elements[n-1]-elements[0]);
        }
