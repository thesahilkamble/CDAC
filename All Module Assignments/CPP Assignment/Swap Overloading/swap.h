#ifndef SWAPPING_H
#define SWAPPING_H

class swapping
{
private:
public:
    void swap(int &ra, int &rb);
    void swap(float &ra, float &rb);
};

void accept(int &a, int &b);
void display(int &a, int &b);
void accept(float &a, float &b);
void display(float &a, float &b);

#endif