Hello, thanks for giving me this opportunity to present myself.
I'd like to write a few notes here.

There were a few things I intentionally avoided doing due to this being a simple
project where the ask was not to take no more than a few hours.
In a normal production world, I'd make a few changes:

1) Logging - using the java.util.logging to keep track of errors
or certain actions being used instead of the System.out.println

2) Config Management - something like a config.json file would help
store important properties, for example the Schedule Update Date instead
of hard coding it or a location for the logger, etc. This is better
because we do not need to change the code, only the config.json file

3) Error handling - I believe I could have looked more into the user inputs
and used try/catch blocks to gracefully handle any exceptions, such as 
IllegalArgumentExceptions or if an appliance failed at 'updating'

4) Scheduling - I used a simple 'scheduler', at work I tend to use the windows
task scheduler, however I'm sure there is a library that exists which can be used
in java for more advanced techniques

5) Unit Testing - I did not implement this but would have in a real world situation

Thanks again for the opportunity to work on this task. I look forward 
to any feedback you may have!

- Alex Velikiy