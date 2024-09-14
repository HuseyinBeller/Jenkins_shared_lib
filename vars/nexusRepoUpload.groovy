// def call(String nexusUrl, String repository, String credentialsId, String, groupId, String artifactId, String version, String packaging, String filePath, String nexusVersion, String protocol, String type) {

//   if (!nexusUrl || !repository || !credentialsId || !groupId || !artifactId || !version || !packaging || !filePath, !nexusVersion ||) {
//     error("Missing required parameters for Nexus upload")
//   }
//     // Using the Nexus Artifact Uploader Plugin to upload to Nexus
//     nexusArtifactUploader(
//         nexusUrl: nexusUrl,
//         nexusVersion: nexusVersion,     // Nexus version: nexus2 or nexus3
//         protocol: protocol,             // or 'https' based on your setup
//         groupId: groupId,               // Maven Group ID
//         version: version,               // Version of the artifact
//         repository: repository,         // Nexus repository (e.g., 'snapshots', 'releases')
//         credentialsId: credentialsId,   // Jenkins credential ID for Nexus authentication
//         artifacts: [
//             [
//                 artifactId: artifactId, // Maven Artifact ID
//                 type: packaging,        // Packaging type (e.g., jar, zip, etc.)
//                 file: filePath       // Path to the file you want to upload
//             ]
//         ]
//     )
// }

def call(String nexusUrl, String repository, String credentialsId, String, groupId, String artifactId, String version, String packaging, String filePath, String nexusVersion, String protocol, String type) {
    // Using the Nexus Artifact Uploader Plugin to upload to Nexus
    nexusArtifactUploader(
        nexusUrl: nexusUrl,
        nexusVersion: nexusVersion,     // Nexus version: nexus2 or nexus3
        protocol: protocol,             // or 'https' based on your setup
        groupId: groupId,               // Maven Group ID
        version: version,               // Version of the artifact
        repository: repository,         // Nexus repository (e.g., 'snapshots', 'releases')
        credentialsId: credentialsId,   // Jenkins credential ID for Nexus authentication
        artifacts: [
            [
                artifactId: artifactId, // Maven Artifact ID
                type: packaging,        // Packaging type (e.g., jar, zip, etc.)
                file: filePath       // Path to the file you want to upload
            ]
        ]
    )
}
