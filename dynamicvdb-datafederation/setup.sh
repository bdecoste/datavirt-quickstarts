echo "!!!!!!!!!!!!!!!!!!!! running"
cp -rf ${HOME}/source/dynamicvdb-datafederation/src/teiidfiles ${JBOSS_HOME}
${JBOSS_HOME|/bin/jboss-cli.sh --connect --file=${HOME}/source/dynamicvdb-datafederation/src/scripts/setup.cli 
cp -rf ${HOME}/source/dynamicvdb-datafederation/src/vdb/* ${JBOSS_HOME}/standalone/deployments
echo "!!!!!!!!!!!!!!!!!!!!!!!! ran"

