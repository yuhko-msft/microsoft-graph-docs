---
title: "Create teamworkDeviceConfiguration"
description: "Create a new teamworkDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamworkDeviceConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Collection URI for Microsoft.Teams.GraphSvc.teamworkDeviceConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) object.

You can specify the following properties when creating a **teamworkDeviceConfiguration**.

|Property|Type|Description|
|:---|:---|:---|
|softwareVersions|[Microsoft.Teams.GraphSvc.teamworkDeviceSoftwareVersions](../resources/teamworkdevicesoftwareversions.md)|**TODO: Add Description** Optional.|
|display|[Microsoft.Teams.GraphSvc.teamworkDisplayConfiguration](../resources/teamworkdisplayconfiguration.md)|**TODO: Add Description** Optional.|
|camera|[Microsoft.Teams.GraphSvc.teamworkCameraConfiguration](../resources/teamworkcameraconfiguration.md)|**TODO: Add Description** Optional.|
|speaker|[Microsoft.Teams.GraphSvc.teamworkSpeakerConfiguration](../resources/teamworkspeakerconfiguration.md)|**TODO: Add Description** Optional.|
|microphone|[Microsoft.Teams.GraphSvc.teamworkMicrophoneConfiguration](../resources/teamworkmicrophoneconfiguration.md)|**TODO: Add Description** Optional.|
|teamsClient|[Microsoft.Teams.GraphSvc.teamworkTeamsClientConfiguration](../resources/teamworkteamsclientconfiguration.md)|**TODO: Add Description** Optional.|
|hardware|[Microsoft.Teams.GraphSvc.teamworkHardwareConfiguration](../resources/teamworkhardwareconfiguration.md)|**TODO: Add Description** Optional.|
|system|[Microsoft.Teams.GraphSvc.teamworkSystemConfiguration](../resources/teamworksystemconfiguration.md)|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|createdBy|[Microsoft.Teams.GraphSvc.identitySet](../resources/identityset.md)|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastModifiedBy|[Microsoft.Teams.GraphSvc.identitySet](../resources/identityset.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamworkdeviceconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for Microsoft.Teams.GraphSvc.teamworkDeviceConfiguration not found
Content-Type: application/json
Content-length: 887

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamworkDeviceConfiguration",
  "softwareVersions": {
    "@odata.type": "microsoft.graph.teamworkDeviceSoftwareVersions"
  },
  "display": {
    "@odata.type": "microsoft.graph.teamworkDisplayConfiguration"
  },
  "camera": {
    "@odata.type": "microsoft.graph.teamworkCameraConfiguration"
  },
  "speaker": {
    "@odata.type": "microsoft.graph.teamworkSpeakerConfiguration"
  },
  "microphone": {
    "@odata.type": "microsoft.graph.teamworkMicrophoneConfiguration"
  },
  "teamsClient": {
    "@odata.type": "microsoft.graph.teamworkTeamsClientConfiguration"
  },
  "hardware": {
    "@odata.type": "microsoft.graph.teamworkHardwareConfiguration"
  },
  "system": {
    "@odata.type": "microsoft.graph.teamworkSystemConfiguration"
  },
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamworkDeviceConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamworkDeviceConfiguration",
  "id": "e8c5b1b9-b1b9-e8c5-b9b1-c5e8b9b1c5e8",
  "softwareVersions": {
    "@odata.type": "microsoft.graph.teamworkDeviceSoftwareVersions"
  },
  "display": {
    "@odata.type": "microsoft.graph.teamworkDisplayConfiguration"
  },
  "camera": {
    "@odata.type": "microsoft.graph.teamworkCameraConfiguration"
  },
  "speaker": {
    "@odata.type": "microsoft.graph.teamworkSpeakerConfiguration"
  },
  "microphone": {
    "@odata.type": "microsoft.graph.teamworkMicrophoneConfiguration"
  },
  "teamsClient": {
    "@odata.type": "microsoft.graph.teamworkTeamsClientConfiguration"
  },
  "hardware": {
    "@odata.type": "microsoft.graph.teamworkHardwareConfiguration"
  },
  "system": {
    "@odata.type": "microsoft.graph.teamworkSystemConfiguration"
  },
  "createdDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  }
}
```

