---
title: "List teamworkDeviceConfiguration"
description: "Get the teamworkDeviceConfiguration resources from the configuration navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List teamworkDeviceConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the teamworkDeviceConfiguration resources from the configuration navigation property.

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
GET /teamwork/devices/{teamworkDeviceId}/configuration
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_teamworkdeviceconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta/teamwork/devices/{teamworkDeviceId}/configuration
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(Microsoft.Teams.GraphSvc.teamworkDeviceConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

