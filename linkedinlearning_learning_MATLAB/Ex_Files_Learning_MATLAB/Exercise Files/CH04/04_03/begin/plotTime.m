myData = csvread('Sine.csv');
x = myData(:,1);
y = myData(:,2);

%Plot the data
figure(1)
plot(x,y,'om')
hold on
plot(x,y,'--c')
grid on
axis tight
ylim([-1.5 1.5])