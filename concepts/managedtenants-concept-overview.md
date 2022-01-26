---
title: "Microsoft 365 Lighthouse API overview"
description: "Microsoft 365 Lighthouse helps managed service providers secure and manage data, devices, and users for SMBs who are using Microsoft 365 Business Premium."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
---

# Overview for Microsoft 365 Lighthouse on Microsoft Graph

Microsoft 365 Lighthouse is used by managed service providers, who are apart of the Cloud Solution Provider program, to secure and manage data, devices, and users at scale for small and medium sized customers who are using Microsoft 365 Business Premium or Microsoft 365 E3. Microsoft Graph provides APIs that enable these managed services providers to gain insights for their customers and react accordingly based on the response.

> [!NOTE]  
> This documentation is about the Microsoft 365 Lighthouse API available on _Microsoft Graph_. A similar offering, Azure Lighthouse, helps service providers deliver managed services for Azure services by using comprehensive and robust management tooling built into the _Azure_ platform. To learn more, see [What is Azure Lighthouse](/azure/lighthouse/overview).

## Why integrate with Microsoft 365 Lighthouse?

As an MSP, you can use the Microsoft 365 Lighthouse API in Microsoft Graph to gain insights into identified risks and take action to help get your customers into a healthy and secure state.

### Devices

You can use the Microsoft 365 Lighthouse APIs to perform the following device tasks:

- Analyze [device compliance trends](/graph/api/resources/managedtenants-manageddevicecompliancetrend?view=graph-rest-beta&preserve-view=true) to better understand how device compliance is evolving over time for your customers.
- Understand what [device compliance policies](/graph/api/resources/managedtenants-manageddevicecompliance) have been created across your customers and the status of the policies.

### Threat management

You can use the Lighthouse API to perform the following threat management tasks:

- Gain insight to the state of [malware](/graph/api/resources/managedtenants-windowsdevicemalwarestate) that is present on the Windows devices registered for management across your customers.
- View the [protection state](/graph/api/resources/managedtenants-windowsprotectionstate?view=graph-rest-beta&preserve-view=true) for Windows devices registered for management across your customers to ensure those using Windows Defender are in a healthy state.

### Users

You can use the Lighthouse API to perform the following user tasks:

- Discover [risky users](/graph/api/resources/managedtenants-riskyuser?view=graph-rest-beta&preserve-view=true) across your customers.
- View [credential user registration summary](/graph/api/resources/managedtenants-credentialuserregistrationssummary?view=graph-rest-beta&preserve-view=true) to understand what users across your customers have registered for multi-factor authentication and self-service password reset.

## API reference

Looking for the API reference for this service?

See [Microsoft 365 Lighthouse API in Microsoft Graph (preview)](/graph/api/resources/managedtenants-managedtenant?view=graph-rest-beta&preserve-view=true).

> [!NOTE]
> The Microsoft 365 Lighthouse API is defined in the OData subnamespace, `microsoft.graph.managedTenants`.

## Next steps

- Learn more about the [Microsoft 365 Lighthouse](/microsoft-365/lighthouse/m365-lighthouse-overview?view=o365-worldwide&preserve-view=true) portal.
- Find out about the [latest new features and updates](/graph/whats-new-overview) for the Microsoft 365 Lighthouse API.
- Explore [examples](https://developer.microsoft.com/graph/graph/examples) for more ideas about how to use Microsoft Graph.
