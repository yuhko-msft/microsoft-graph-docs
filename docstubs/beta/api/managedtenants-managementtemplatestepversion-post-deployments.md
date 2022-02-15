---
title: "Create managementTemplateStepDeployment"
description: "Create a new managementTemplateStepDeployment object."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: apiPageType
---

# Create managementTemplateStepDeployment
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|ManagedTenants.Read.All, ManagedTenants.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/versions/{managementTemplateStepVersionId}/deployments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object.

You can specify the following properties when creating a **managementTemplateStepDeployment**.

|Property|Type|Description|
|:---|:---|:---|
|tenantId|String|**TODO: Add Description** Required.|
|status|managementTemplateDeploymentStatus|**TODO: Add Description**. The possible values are: `unknown`, `inProgress`, `completed`, `failed`, `ineligible`, `unknownFutureValue`. Required.|
|error|[microsoft.graph.managedTenants.graphAPIErrorDetails](../resources/managedtenants-graphapierrordetails.md)|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|createdByUserId|String|**TODO: Add Description** Optional.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastActionByUserId|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_managementtemplatestepdeployment_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/versions/{managementTemplateStepVersionId}/deployments
Content-Type: application/json
Content-length: 345

{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepDeployment",
  "tenantId": "String",
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.managedTenants.graphAPIErrorDetails"
  },
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedTenants.managementTemplateStepDeployment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepDeployment",
  "id": "30dd4e3e-67e0-07e1-d197-18f4684c354d",
  "tenantId": "String",
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.managedTenants.graphAPIErrorDetails"
  },
  "createdDateTime": "String (timestamp)",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```

