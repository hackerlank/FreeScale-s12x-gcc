#include <stdio.h>

static struct sss{
  long long f;
} a[10];

int main (void) {
  printf ("++++Array of struct with longlong:\n");
  printf ("size=%d,align=%d,displ-a[5]=%d,align-a[5]=%d\n",
          sizeof (a), __alignof__ (a), (char*)&a[5] - (char*)a, __alignof__ (a[5]));
  return 0;
}
