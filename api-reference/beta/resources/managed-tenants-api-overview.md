---
title: "Working with the Microsoft 365 Lighthouse APIs in Microsoft Graph"
description: "Managed service providers can use the Microsoft 365 Lighthouse APIs in Microsoft Graph to manage and secure data, devices, and identities for their customers."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: resourcePageType
---

# Working with the Microsoft 365 Lighthouse APIs in Microsoft Graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Microsoft 365 Lighthouse is used by managed service providers, who are apart of the Cloud Solution Provider program, to secure and manage data, devices, and users at scale for small and medium sized customers who are using Microsoft 365 Business Premium or Microsoft 365 E3. Microsoft Graph provides APIs that enable these managed services providers to gain insights for their customers and react accordingly based on the response.

> [!IMPORTANT]
> Accessing the Microsoft Graph APIs for Microsoft 365 Lighthouse only supports delegated permissions and requires multi-factor authentication. Use of the secure application model will be needed if you are looking to utilize these APIs non-interactively. See [Enabling the secure application model](../../../concepts/auth-cloudsolutionprovider.md) for more information.

## Common use cases

The following are common requests for interacting with the Microsoft 365 Lighthouse API.

| **Use cases**   | **REST resources** | **Try it in Graph Explorer** |
|:----------------|:-------------------|:-----------------------------|
| List aggregated device compliance policies | [List aggregatedPolicyCompliances](../api/managedtenants-managedtenant-list-aggregatedpolicycompliances.md) | [https://graph.microsoft.com/beta/tenantRelationships/managedTenants/aggregatedPolicyCompliances](https://developer.microsoft.com/graph/graph-explorer?request=tenantRelationships/managedTenants/aggregatedPolicyCompliances&method=GET&version=beta&GraphUrl=https://graph.microsoft.com) |
| List conditional access policy coverage | [List conditionalAccessPolicyCoverages](../api/managedtenants-managedtenant-list-conditionalaccesspolicycoverages.md) | [https://graph.microsoft.com/beta/tenantRelationships/managedTenants/conditionalAccessPolicyCoverages](https://developer.microsoft.com/graph/graph-explorer?request=tenantRelationships/managedTenants/conditionalAccessPolicyCoverages&method=GET&version=beta&GraphUrl=https://graph.microsoft.com) |
| List managed device compliance | [List managedDeviceCompliances](../api/managedtenants-managedtenant-list-manageddevicecompliances.md) | [https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managedDeviceCompliances](https://developer.microsoft.com/graph/graph-explorer?request=tenantRelationships/managedTenants/managedDeviceCompliances&method=GET&version=beta&GraphUrl=https://graph.microsoft.com) |
| List tenants | [List tenants](../api/managedtenants-managedtenant-list-tenants.md) | [https://graph.microsoft.com/beta/tenantRelationships/managedTenants/tenants](https://developer.microsoft.com/graph/graph-explorer?request=tenantRelationships/managedTenants/tenants&method=GET&version=beta&GraphUrl=https://graph.microsoft.com) |
| List Windows device malware states | [List windowsDeviceMalwareStates](../api/managedtenants-managedtenant-list-windowsdevicemalwarestates.md) | [https://graph.microsoft.com/beta/tenantRelationships/managedTenants/windowsDeviceMalwareStates](https://developer.microsoft.com/graph/graph-explorer?request=tenantRelationships/managedTenants/windowsDeviceMalwareStates&method=GET&version=beta&GraphUrl=https://graph.microsoft.com) |

## What's new

Find out about the [latest new features and updates](/graph/whats-new-overview) for these API sets.
