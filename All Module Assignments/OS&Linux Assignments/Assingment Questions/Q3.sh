
#!/bin/bash

ls -l | awk '{print $5, $9}' | sort -n | awk 'NR==2 {print $0} END{print $0}' 