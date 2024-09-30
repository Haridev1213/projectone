# Use a Windows base image
FROM mcr.microsoft.com/windows/servercore:ltsc2022

# Set the working directory
WORKDIR /app

# Copy the batch file into the container
COPY testing.bat .

# Run the batch file
CMD ["cmd", "/c", "testing.bat"]
