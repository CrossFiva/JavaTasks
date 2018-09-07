

void swap(int *a, int *b){
  int temp;
  temp = *a;
  *a = *b;
  *b= temp;
};
 
int shell_sort(int A[], int n){
  int span, i;
  span = n/2;
  while(span>=1){
    for(i = 0; i<(n-span); i++){
      if(A[i]>A[i+span]){
        swap(&A[i], &A[i+span]);
      }
    }
    span = span/2;
  }
};
 
int main(){
  int count, i;
  count = 10;
  int list[count] = {9,8,7,6,5,4,3,2,1,0};

  
  printf("Numbers to be sorted: ");

  printf("\n");
  shell_sort(list, count);
  printf("Numbers Sorted: ");
  for(i = 0; i<count; i++){
    printf("%d ", list[i]);
  }
  return 0;
}