%While loop
threshold = 8;

while true
    num = randi(10);
    if num > threshold
        disp('Over the limit! SHUT DOWN!')
        break
    end
    disp('Everything is OKAY.')
end




%for loop
% n = 25;
% step = 5;
% 
% for i = 0:step:n
%     disp(i)
% end