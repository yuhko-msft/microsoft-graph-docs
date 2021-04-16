---
title: "alert: updateAlerts"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# alert: updateAlerts
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /security/alerts/updateAlerts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|value|[alert](../resources/alert.md) collection|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [alert](../resources/alert.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "alert_updatealerts"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/security/alerts/updateAlerts

Content-Type: application/json
Content-length: 3084

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.alert",
      "id": "String (identifier)",
      "activityGroupName": "String",
      "alertDetections": [
        {
          "@odata.type": "microsoft.graph.alertDetection"
        }
      ],
      "assignedTo": "String",
      "azureSubscriptionId": "String",
      "azureTenantId": "String",
      "category": "String",
      "closedDateTime": "String (timestamp)",
      "cloudAppStates": [
        {
          "@odata.type": "microsoft.graph.cloudAppSecurityState"
        }
      ],
      "comments": [
        "String"
      ],
      "confidence": "Integer",
      "createdDateTime": "String (timestamp)",
      "description": "String",
      "detectionIds": [
        "String"
      ],
      "eventDateTime": "String (timestamp)",
      "feedback": "String",
      "fileStates": [
        {
          "@odata.type": "microsoft.graph.fileSecurityState"
        }
      ],
      "historyStates": [
        {
          "@odata.type": "microsoft.graph.alertHistoryState"
        }
      ],
      "hostStates": [
        {
          "@odata.type": "microsoft.graph.hostSecurityState"
        }
      ],
      "incidentIds": [
        "String"
      ],
      "investigationSecurityStates": [
        {
          "@odata.type": "microsoft.graph.investigationSecurityState"
        }
      ],
      "lastEventDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "malwareStates": [
        {
          "@odata.type": "microsoft.graph.malwareState"
        }
      ],
      "messageSecurityStates": [
        {
          "@odata.type": "microsoft.graph.messageSecurityState"
        }
      ],
      "networkConnections": [
        {
          "@odata.type": "microsoft.graph.networkConnection"
        }
      ],
      "processes": [
        {
          "@odata.type": "microsoft.graph.process"
        }
      ],
      "recommendedActions": [
        "String"
      ],
      "registryKeyStates": [
        {
          "@odata.type": "microsoft.graph.registryKeyState"
        }
      ],
      "securityResources": [
        {
          "@odata.type": "microsoft.graph.securityResource"
        }
      ],
      "severity": "String",
      "sourceMaterials": [
        "String"
      ],
      "status": "String",
      "tags": [
        "String"
      ],
      "title": "String",
      "triggers": [
        {
          "@odata.type": "microsoft.graph.alertTrigger"
        }
      ],
      "uriClickSecurityStates": [
        {
          "@odata.type": "microsoft.graph.uriClickSecurityState"
        }
      ],
      "userStates": [
        {
          "@odata.type": "microsoft.graph.userSecurityState"
        }
      ],
      "vendorInformation": {
        "@odata.type": "microsoft.graph.securityVendorInformation"
      },
      "vulnerabilityStates": [
        {
          "@odata.type": "microsoft.graph.vulnerabilityState"
        }
      ]
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.alert)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.alert",
      "id": "String (identifier)",
      "activityGroupName": "String",
      "alertDetections": [
        {
          "@odata.type": "microsoft.graph.alertDetection"
        }
      ],
      "assignedTo": "String",
      "azureSubscriptionId": "String",
      "azureTenantId": "String",
      "category": "String",
      "closedDateTime": "String (timestamp)",
      "cloudAppStates": [
        {
          "@odata.type": "microsoft.graph.cloudAppSecurityState"
        }
      ],
      "comments": [
        "String"
      ],
      "confidence": "Integer",
      "createdDateTime": "String (timestamp)",
      "description": "String",
      "detectionIds": [
        "String"
      ],
      "eventDateTime": "String (timestamp)",
      "feedback": "String",
      "fileStates": [
        {
          "@odata.type": "microsoft.graph.fileSecurityState"
        }
      ],
      "historyStates": [
        {
          "@odata.type": "microsoft.graph.alertHistoryState"
        }
      ],
      "hostStates": [
        {
          "@odata.type": "microsoft.graph.hostSecurityState"
        }
      ],
      "incidentIds": [
        "String"
      ],
      "investigationSecurityStates": [
        {
          "@odata.type": "microsoft.graph.investigationSecurityState"
        }
      ],
      "lastEventDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "malwareStates": [
        {
          "@odata.type": "microsoft.graph.malwareState"
        }
      ],
      "messageSecurityStates": [
        {
          "@odata.type": "microsoft.graph.messageSecurityState"
        }
      ],
      "networkConnections": [
        {
          "@odata.type": "microsoft.graph.networkConnection"
        }
      ],
      "processes": [
        {
          "@odata.type": "microsoft.graph.process"
        }
      ],
      "recommendedActions": [
        "String"
      ],
      "registryKeyStates": [
        {
          "@odata.type": "microsoft.graph.registryKeyState"
        }
      ],
      "securityResources": [
        {
          "@odata.type": "microsoft.graph.securityResource"
        }
      ],
      "severity": "String",
      "sourceMaterials": [
        "String"
      ],
      "status": "String",
      "tags": [
        "String"
      ],
      "title": "String",
      "triggers": [
        {
          "@odata.type": "microsoft.graph.alertTrigger"
        }
      ],
      "uriClickSecurityStates": [
        {
          "@odata.type": "microsoft.graph.uriClickSecurityState"
        }
      ],
      "userStates": [
        {
          "@odata.type": "microsoft.graph.userSecurityState"
        }
      ],
      "vendorInformation": {
        "@odata.type": "microsoft.graph.securityVendorInformation"
      },
      "vulnerabilityStates": [
        {
          "@odata.type": "microsoft.graph.vulnerabilityState"
        }
      ]
    }
  ]
}
```

