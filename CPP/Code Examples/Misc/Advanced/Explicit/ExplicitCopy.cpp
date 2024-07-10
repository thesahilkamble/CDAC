
class A {};
 
 // Another simple class with a single-argument constructor for class A
 class B
 {
 public:
  B() {}
 explicit  B(A const&) {}
  };
          
 // A function that expects a 'B'
 void f(B const&) {}
         
 int main()
  {
    A obj;
   f(B(obj)); // Spot the deliberate mistake
   }
