#include "shape.h"

class Square:public Shape
{
        private:
            int side;
        public:
                // void Display();
                void Accept();
                float CalcArea();
                float CalcPeri();
};


