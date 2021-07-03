myData = csvread('Sine.csv');
x = myData(:,1);
y = myData(:,2);

%Plot the data
figure(1)
plot(x,y,'om')
hold on
plot(x,.5*y,'^b')
grid on
axis tight
ylim([-1.5 1.5])
xlabel('Time (s)')
ylabel('Airspeed (m/s)')
title('My Awesome Plot')
legend('Europen Swallow','African Swallow')
hold off