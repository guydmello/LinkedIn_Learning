myData = csvread('Sine.csv');
x = myData(:,1);
y = myData(:,2);

%Plot the data
figure(1)
plot(x,y)