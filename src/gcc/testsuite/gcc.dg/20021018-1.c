/* { dg-do run } */
/* { dg-options "-O2 -fpic" } */
/* { dg-warning "not supported" "PIC unsupported" { target m6811-*-* m6812-*-* } 0 } */

extern void abort (void);
extern void exit (int);

static const long foo [10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

long __attribute__((noinline))
bar (int x)
{
  return foo [x - 0x6ffffffa];
}

int
main (void)
{
  if (bar (0x6ffffffc) != 2)
    abort ();
  exit (0);
}
