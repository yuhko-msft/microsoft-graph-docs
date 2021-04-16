---
title: "Create windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary"
description: "Create a new windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary
Namespace: microsoft.graph



Create a new [windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentsummary.md) object.

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
POST ** Collection URI for microsoft.graph.windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentsummary.md) object.

The following table shows the properties that are required when you create the [windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deployedDeviceCount|Int32|Number of Devices that have successfully deployed this WindowsDefenderApplicationControl supplemental policy.|
|failedDeviceCount|Int32|Number of Devices that have failed to deploy this WindowsDefenderApplicationControl supplemental policy.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsdefenderapplicationcontrolsupplementalpolicydeploymentsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary not found
Content-Type: application/json
Content-length: 182

{
  "@odata.type": "#microsoft.graph.windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary",
  "deployedDeviceCount": "Integer",
  "failedDeviceCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary",
  "id": "36afe922-e922-36af-22e9-af3622e9af36",
  "deployedDeviceCount": "Integer",
  "failedDeviceCount": "Integer"
}
```

